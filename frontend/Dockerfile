FROM node:12.16.0

COPY . /app

WORKDIR /app

RUN ["npm", "install"]

EXPOSE 8081/tcp

CMD ["npm", "start"]